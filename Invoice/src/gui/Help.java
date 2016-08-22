package gui;

import dataManagement.SystemData;
import javax.swing.JFrame;

public class Help extends javax.swing.JPanel {
    JFrame  panelHolder;
    SystemData systemData;
    
    public Help(JFrame  panelHolder, SystemData systemData) {
        this.panelHolder = panelHolder;
        this.systemData = systemData; 
        initComponents();
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("1.Log in\nTo Log in into the system:\ni.Launch the �Invoice Generation System� application\nii.Enter your user name and password in corresponding fields.\niii.On successful log in, you will land on the Home page with the welcome message.\n\n2.Maintain\n2.1 Company\n2.1.1Edit\nTo Edit Company information:\ni.Click on Maintain menu in the Menu Bar\nii.Click on Company menu-item from the list\niii.You will be navigated to \"Company Information Page\"\niv.This shows the current Company information\nv.Click on Edit Button\nvi.You will be navigated to \"Company Edit Page\" as shown below\nvii.Now make changes as required\nviii.a. Click on Save button to save the changes you made\nor    b. Click on Cancel Button to cancel the changes you made\nix.In either case you will be redirected to the \"Home Page\"\n\n2.2Client\n2.2.1 Edit\nTo Edit Client information:\ni.Click on Maintain menu in the Menu Bar\nii.Click on Client menu-item from the list\niii.You will be navigated to \"Client Information Page\"\niv.This shows the current Client information\nv.Click on Edit Button\nvi.You will be navigated to \"Client Edit Page\"\nvii.Now make changes as required\nviii.a. Click on Save button to save the changes you made\nor    b. Click on Cancel Button to cancel the changes you made\nix.In either case you will be redirected to the \"Home Page\"\n\n2.2.2 Add New Client\nTo Add a new Client:\ni.Click on Maintain menu in the Menu Bar\nii.Click on Client menu-item from the list\niii.You will be navigated to \"Client Information Page\"\niv.Click on Add Button\nv.You will be navigated to \"Client Add Page\" \nvi.Now enter information of the new client \nvii.a. Click on Save button to save the new Client\nor    b. Click on Cancel Button to cancel discard the operation\nviii.In either case you will be redirected to the \"Home Page\"\n\n2.3Employee\n2.3.1 Edit\nTo Edit Employee information:\ni.Click on Maintain menu in the Menu Bar\nii.Click on Employee menu-item from the list\niii.You will be navigated to \"Employee Information Page\"\niv.This shows the current Employee information\nv.Click on Edit Button\nvi.You will be navigated to \"Employee Edit Page\"\nvii.Now make changes as required\nviii.a. Click on Save button to save the changes you made\nor    b. Click on Cancel Button to cancel the changes you made\nix.In either case you will be redirected to the \"Home Page\"\n\n2.3.2 Add New Employee\nTo Add a new Employee:\ni.Click on Maintain menu in the Menu Bar\nii.Click on Employee menu-item from the list\niii.You will be navigated to \"Employee Information Page\"\niv.Click on Add Button\nv.You will be navigated to \"Employee Add Page\" \nvi.Now enter information of the new Employee \nvii.a. Click on Save button to save the new Employee\nor    b. Click on Cancel Button to cancel discard the operation\nviii.In either case you will be redirected to the \"Home Page\"\n\n2.4Project\n2.4.1 Edit\nTo Edit Project information:\ni.Click on Maintain menu in the Menu Bar\nii.Click on Project menu-item from the list\niii.You will be navigated to \"Project Information Page\"\niv.This shows the current Project information\nv.Click on Edit Button\nvi.You will be navigated to \"Project Edit Page\"\nvii.Now make changes as required\nviii.a. Click on Save button to save the changes you made\nor    b. Click on Cancel Button to cancel the changes you made\nix.In either case you will be redirected to the \"Home Page\"\n\n2.4.2 Add New Project\nTo Add a new Project:\ni.Click on Maintain menu in the Menu Bar\nii.Click on Project menu-item from the list\niii.You will be navigated to \"Project Information Page\"\niv.Click on Add Button\nv.You will be navigated to \"Project Add Page\" \nvi.Now enter information of the new Project \nvii.a. Click on Save button to save the new Project\nor    b. Click on Cancel Button to cancel discard the operation\nviii.In either case you will be redirected to the \"Home Page\"\n\n3.Report\n3.1 Available Employees\nTo view/save the Report of Employees Available:\ni.Click on Report menu in the Menu Bar\nii.Click on Available Employees menu-item from the list\niii.You will be navigated to \" Available Employees Page\"\niv.This shows the details of the Available Employees\nv.To get back to Home page click Cancel button.\nvi.To save report click on Save as PDF button\nvii.A dialog window will appear\nviii.Now choose the intended directory to save the report \nix.You can change the name of the report\nx.Hit ok button to save the report\nxi.On successful save, you will be redirected to the \"Home Page\"\n\n3.2Hours Clocked\nTo see/save the Report of Hours Clocked:\ni.Click on Report menu in the Menu Bar\nii.Click on Hours Clocked menu-item from the list\niii.You will be navigated to \" Hours Clocked Page\"\niv.This shows the details of the Hours Clocked for the current week\nv.To see the Hours clocked in some other week, choose the corresponding radio button. And select the start date and the end date of the week using the combo box. Report for the same will the generated accordingly.\nvi.To get back to Home page click Back button.\nvii.To save report click on Save as PDF button\nviii.A dialog window will appear\nix.Now choose the intended directory to save the report \nx.You can change the name of the report\nxi.Hit ok button to save the report\nxii.On successful save, you will be redirected to the \"Home Page\"\n\n3.3Project Report\nTo view/save the progress Report of Projects:\ni.Click on Report menu in the Menu Bar\nii.Click on Project Report menu-item from the list\niii.You will be navigated to \" Project Report Page\"\niv.You can filter the projects using the first radio button by project status\na.Select �In Progress� to see only projects which are still running\nb.Select �Closed� to see only projects which are already finished\nc.Select �All� to see report for all projects irrespective of the status.\nv.To show project for a particular client check the checkbox �Filter By Client� and choose the required Client name from the Combo Box.\nvi.To show project managed by a particular Manager check the checkbox �Filter By Manager� and choose the required Manager name from the Combo Box.\nvii.To filter project by start date, check the checkbox �Filter By Start date� and choose the date range using the Combo Boxes.\nviii.To filter project by end date, check the checkbox �Filter By End date� and choose the date range using the Combo Boxes.\nix.To get back to Home page click Back button.\nx.To save report click on Save as PDF button\nxi.A dialog window will appear\nxii.Now choose the intended directory to save the report \nxiii.You can change the name of the report\nxiv.Hit ok button to save the report\nxv.On successful save, you will be redirected to the \"Home Page\"\n\n4.Manage\n4.1 Developers\nTo manage Developers:\ni.Click on Manage menu in the Menu Bar\nii.Click on Available Developers menu-item from the list\niii.You will be navigated to \" Manage Developers Page\"\niv.Select the project name from the combo box for which you want to manage developers\nv.You will see two table. \na.Table for exiting Developers in the project. From this table, you can activate or deactivate any existing developer. To do so click on row corresponding to the exiting developer and then click on the Activate/ Deactivate button as required. \nb.Table for other available Developers in the company. From this table, you can add new developer to the project. To do so click on row corresponding to the new developer and then click on the Add button. \nvi.To save changes click on Save button.\nvii.To discard the operation, Click Back button.\nviii.In both case you will be redirected to the \"Home Page\"\n\n4.2Approve Hours\nTo Approve Hours:\ni.Click on Manage menu in the Menu Bar\nii.Click on Approve Hours menu-item from the list\niii.You will be navigated to \" Approve Hours Page\"\niv.Select the project name from the combo box for which you want to approve hours or select the radio button for if you want to approve hours for all the projects managed by you.\nv.You can modify the hours clocked the employees if there is any discrepancy\nvi.Check �Select All� Check Box is you want to approve all hours in one go.\nvii.Alternatively, check the checkboxes against those row only which you want to approve.\nviii.Now click on Approve button to approve the hours clocked.\nix.To discard the operation, Click Back button.\nx.In each case you will be redirected to the \"Home Page\"\n\n4.3Manage Project\nTo Manage Project:\ni.Click on Manage menu in the Menu Bar\nii.Click on Manage Project menu-item from the list\niii.You will be navigated to \" Manage Project Page\"\niv.Select the project name from the combo box for which you want to Manage \nv.You can modify the Budget/Project End Date/ change the status of the project.\nvi.To discard the operation, Click Back button. \nvii.To save the modifications done, click on �Save Changes� button\nviii.In each case you will be redirected to the \"Home Page\"\n\n5.Invoice\n5.1 Generate/ Mail\nTo generate/ mail Invoice:\ni.Click on Invoice menu in the Menu Bar\nii.Click on �Generate/ Mail �menu-item from the list\niii.You will be navigated to \" Generate Invoice Page\"\niv.Projects to be invoiced on the current week will be shown.\nv.You will see three types of Invoice status \na.Hours Approval Pending: For any project, having this status you can only send reminder to manager. To do so, check the corresponding checkboxes and click �Send Reminder to Manager� button.\nb.Hours Approved: For any project, having this status you can generate invoice. To do so, check the corresponding checkboxes and click �Generate Invoice� button.\nc.Invoice generated: For any project, having this status you can mail the generated invoice to the client. To do so, check the corresponding checkboxes and click �Mail Invoice� button.\nvi.Click Back button to get back to \"Home Page\"\n\n5.2Save as PDF\nTo save Invoice in PDF format:\ni.Click on Invoice menu in the Menu Bar\nii.Click on �Save as PDF �menu-item from the list\niii.You will be navigated to \" Save Invoice as PDF� Page\niv.By default, Invoices of the current week will be shown\nv.To see Invoices for some other timespan, the Select the date ranges accordingly using the combo boxes on the screen\nvi.The corresponding Invoices will be displayed.\nvii.Click on the �Save as PDF� button against any Invoice row, to save the Invoice.\nviii.A dialog window will appear\nix.Now choose the intended directory to save the report \nvii.You can change the name of the report\nviii.Hit ok button to save the report\nix.Click Back button to get back to \"Home Page\"\n\n6.Username\n6.1 Clock Hours\nTo generate/ mail Invoice:\ni.Click on your Username in the Menu Bar\nii.Click on �Clock Hours� menu-item from the list \niii.Select the week for which you want to clock hours using the combo box.\niv.Enter hours for each day against each of the projects.\nv.To save click on Save Button\nvi.To discard the changes, click Cancel button\nvii.You will get back to Home page in either case.\n\n6.2Change Password\nTo generate/ mail Invoice:\ni.Click on your Username in the Menu Bar\nii.Click on �Change Password � menu-item from the list \niii.You will be navigated to \" Change Password Page\"\niv.Enter your current password for verification. Insert new Password and Confirm New Password in the corresponding password field.\nv.Click on the Change button to change the password. \nvi.To cancel the operation, click on the Cancel button.\nvii.You will be redirected to �Home page� in both operations\n\n6.3Log out\nTo generate/ mail Invoice:\ni.Before Logging out make sure you save all your work.\nii.Click on your Username in the Menu Bar\niii.Click on �Log out� menu-item from the list\niv.You will be redirected to \" Home Page\"\n\n7.Help\nTo get general help in operating the system:\ni.Click on Help menu in the Menu Bar\nii.The Help Page will appear.\niii. On the left side of the page, items will be displayed organized in for of a tree structure.\niv.Expand the tree to find the desired item for which you need help \nv.Click on the Item and read the corresponding text displayed.\n\n\n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   
}