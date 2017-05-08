package pe.devpicon.android.kotlinworkshopapp.data.entity;

import java.util.List;

/**
 * Created by Armando on 7/5/2017.
 */

public class ListWrapper<T> {
    List<T> records;

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }
}
