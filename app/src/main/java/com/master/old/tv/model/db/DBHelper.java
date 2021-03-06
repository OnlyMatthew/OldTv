package com.master.old.tv.model.db;

import com.master.old.tv.model.bean.Collection;
import com.master.old.tv.model.bean.Record;
import com.master.old.tv.model.bean.SearchKey;

import java.util.List;

import io.realm.Realm;


/**
 * @author: Est <codeest.dev@gmail.com>
 * @date: 2017/4/21
 * @description:
 */

public interface DBHelper {
    Realm getRealm();

    void insertCollection(Collection bean);

    void deleteCollection(String id);

    void deleteAllCollection();

    boolean queryCollectionId(String id);

    List<Collection> getCollectionList();

    void insertRecord(Record bean, int maxSize);

    void deleteRecord(String id);

    boolean queryRecordId(String id);

    List<Record> getRecordList();

    void deleteAllRecord();

    void insertSearchHistory(SearchKey bean);

    List<SearchKey> getSearchHistoryList(String value);

    void deleteSearchHistoryList(String value);

    void deleteSearchHistoryAll();

    List<SearchKey> getSearchHistoryListAll();
}
