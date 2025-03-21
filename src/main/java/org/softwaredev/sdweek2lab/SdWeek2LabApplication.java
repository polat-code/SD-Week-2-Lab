package org.softwaredev.sdweek2lab;

import org.softwaredev.sdweek2lab.services.HiringManager;
import org.softwaredev.sdweek2lab.services.LibraryManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SdWeek2LabApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext =  SpringApplication.run(SdWeek2LabApplication.class, args);
        //LibraryManager libraryManager =  applicationContext.getBean(LibraryManager.class);
        //libraryManager.hireBook(1L,1L);
    }

}
