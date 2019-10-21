package ru.test.arh.client.pojo;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import java.util.Date;
@Entity
public class TableTestPojo {
    private Date field1;
    private String field2;
    private Boolean field3;

    public  TableTestPojo(Date field1, String field2, Boolean field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public  Date getField1() {
        return field1;
    }

    public  String getField2() {
        return field2;
    }

    public  Boolean getField3() {
        return field3;
    }
}