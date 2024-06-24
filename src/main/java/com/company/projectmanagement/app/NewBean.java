package com.company.projectmanagement.app;

import com.company.projectmanagement.entity.Project;
import com.company.projectmanagement.entity.Task;
import io.jmix.core.DataManager;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class NewBean {
    private final DataManager dataManager;

    public NewBean(DataManager dataManager) {
        this.dataManager = dataManager;
    }
  public List<Task> loadTasksByQuery(){
      final List<Task> myEntityList = dataManager.load(Task.class)
              .query("select t from Task_ t where extract(month from t.dueDate) = :month")
              .parameter("month", LocalDate.now().getMonthValue())
              .list();
return  myEntityList;
  }
}