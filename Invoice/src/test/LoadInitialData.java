package test;

import dataManagement.LoadClient;
import dataManagement.LoadCompany;
import dataManagement.LoadEmployee;
import dataManagement.LoadProject;


public class LoadInitialData {
    public static void main(String args[]){        
        new LoadCompany("data/company_data.csv");
        new LoadClient("data/client_data.csv");
        new LoadEmployee("data/people_data.csv");
        new LoadProject("data/project_data.csv");    
    }
    
}
