//package com.company.projectmanagement.app;
//
//import com.company.projectmanagement.entity.Project;
//import io.jmix.core.DataManager;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class ProjectStatsService {
//    public final DataManager dataManager;
//
//    public  ProjectStatsService(DataManager dataManager ){
//        this.dataManager=dataManager;
//    }
//    public List<ProjectStats> fetchingProjectStatistics(){
//        dataManager.load(Project.class).all().list();
//        List<ProjectStats>
//    }
//}