package com.winst.application.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

import com.winst.application.dao.AppDatabase;
import com.winst.application.model.BorrowModel;

import java.util.List;


public class BorrowedListViewModel extends AndroidViewModel {

    private final LiveData<List<BorrowModel>> itemAndPersonList;

    private AppDatabase appDatabase;

    public BorrowedListViewModel(@NonNull Application application) {
        super(application);
        this.appDatabase = AppDatabase.getDatabase(this.getApplication());
        this.itemAndPersonList = appDatabase.itemAndPersonModel().getAllBorrowedItems();
    }

    public LiveData<List<BorrowModel>> getItemAndPersonList() {
        return itemAndPersonList;
    }

    public void deleteItem(BorrowModel borrowModel) {
        new DeleteAsyncTask(appDatabase).execute(borrowModel);
    }

    private static class DeleteAsyncTask extends AsyncTask<BorrowModel, Void, Void> {
        private AppDatabase appDatabase;

        DeleteAsyncTask(AppDatabase appDatabase) {
            this.appDatabase = appDatabase;
        }

        @Override
        protected Void doInBackground(final BorrowModel... params) {
            appDatabase.itemAndPersonModel().deleteBorrow(params[0]);
            return null;
        }
    }
}
