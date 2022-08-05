package com.obtaincare.UI.SQLTables;

public class StudentTable extends BaseTable {
    public void checkStudentNames() {
        mySQLHelper.queryColumnIndex("select * from students", 2,3);
    }
}
