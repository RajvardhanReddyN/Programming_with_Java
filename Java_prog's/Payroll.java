import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import java.util.*;
import java.io.*;

public class Payroll extends Application
{
    private TextField tfNumOfEmployees = new TextField();
    private TextField tfEmpFirstName = new TextField();
    private TextField tfEmpLastName = new TextField();
    private TextField tfEmpPayRate = new TextField();
    private TextField tfEmpHoursWorked = new TextField();
    private Button btEnterNum = new Button("Submit");
    private Button btNextEmp = new Button("Add Employee");
    private Button btRunReport = new Button("Run Report");
    private Button btQuit = new Button("Quit");
     
    //Declare Variables
    int totalEmployees;
    int index = 0;
    String[] firstName = new String[totalEmployees];
    String[] lastName = new String[totalEmployees];
    double[] payRate = new double[totalEmployees];
    double[] hoursWorked = new double[totalEmployees];
    
    public void start(Stage primaryStage)
    {
        //Create the UI
        GridPane gridPane =new GridPane();
        GridPane gridPane2 = new GridPane();
        gridPane.setHgap(75);
        gridPane.setVgap(15);
        gridPane.add(new Label("Employee's First Name:"), 0, 0);
        gridPane.add(tfEmpFirstName, 1, 0);
        gridPane.add(new Label("Employee's Last Name:"), 0, 1);
        gridPane.add(tfEmpLastName, 1, 1);
        gridPane.add(new Label("Employee's Hourly Pay Rate:"), 0, 2);
        gridPane.add(tfEmpPayRate, 1, 2);
        gridPane.add(new Label("Hours Worked by Employee"), 0, 3);
        gridPane.add(tfEmpHoursWorked, 1, 3);
        gridPane.add(btNextEmp, 1, 4);
        gridPane.add(btQuit, 0, 6);
        gridPane.add(btRunReport, 1, 6);
         
        //Set properties
        gridPane.setAlignment(Pos.CENTER);
        tfEmpFirstName.setAlignment(Pos.BOTTOM_RIGHT);
        tfEmpLastName.setAlignment(Pos.BOTTOM_RIGHT);
        tfEmpPayRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfEmpHoursWorked.setAlignment(Pos.BOTTOM_RIGHT);
        GridPane.setHalignment(btQuit, HPos.LEFT);
        GridPane.setHalignment(btRunReport, HPos.RIGHT);
        GridPane.setHalignment(btNextEmp, HPos.RIGHT);
         
        gridPane2.setHgap(75);
        gridPane2.setVgap(15);
        gridPane2.add(new Label("Enter the Number of Employees:"), 0, 0);
        gridPane2.add(tfNumOfEmployees,0 ,1);
        gridPane2.add(btEnterNum, 0, 2);
         
        gridPane2.setAlignment(Pos.CENTER);
        tfNumOfEmployees.setAlignment(Pos.BOTTOM_RIGHT);
        GridPane.setHalignment(btEnterNum, HPos.CENTER);    
         
        btEnterNum.setOnAction(e -> getArraySize());
        btRunReport.setOnAction(e -> outputReport());
        btNextEmp.setOnAction(e -> addEmployeeData());
        btQuit.setOnAction(e -> quitApplication());
         
        // Create a scene and place it in the stage
        Scene scene= new Scene(gridPane, 400, 250) ;
        primaryStage.setTitle("Payroll Calculator"); // Set title
        primaryStage.setScene(scene); // Place the scene in t he stage
        primaryStage.show(); // Display the stage   
         
        //Create new window to get number of employees
        Stage stage2 = new Stage();
        Scene scene2 = new Scene(gridPane2, 200, 150);
        stage2.setTitle("Number of Employees");
        stage2.setScene(scene2);
        stage2.show();
    }
     
    public void getArraySize()
    {
        totalEmployees = Integer.parseInt(tfNumOfEmployees.getText());
        //stage2.close();
    }
     
    public void addEmployeeData()
    {
 
        while (index < firstName.length)
        {
            firstName[index] = tfEmpFirstName.getText();
            lastName[index] = tfEmpLastName.getText();
            payRate[index] = Double.parseDouble(tfEmpPayRate.getText());
            hoursWorked[index] = Integer.parseInt(tfEmpHoursWorked.getText());
             
            index ++;
            break;
        }
         
        tfEmpFirstName.clear();
        tfEmpLastName.clear();
        tfEmpPayRate.clear();
        tfEmpHoursWorked.clear();
    }
     
    public void outputReport() throws IOException 
    {
        PrintWriter empPayroll = new PrintWriter("Payroll.txt");
         
        double regularHours = 0;
        double overtimeHours = 0;
        double regularPay = 0;
        double overtimePay = 0;
        double totalPay = 0;
         
        for (index = 0; index < firstName.length; index ++)
        {
            if(hoursWorked[index] >= 40)
                regularHours = 40;
            else
                regularHours = hoursWorked[index];
             
            if(hoursWorked[index] > 40)
                overtimeHours = hoursWorked[index] - 40;
            else
                overtimeHours = 0;
             
            regularPay = (payRate[index] * regularHours);
             
            overtimePay = ((payRate[index] * 1.5) * overtimeHours);
             
            totalPay = regularPay + overtimePay;            
             
            empPayroll.println("\nName: " + firstName[index] + " " + lastName[index]);
            empPayroll.println("Pay Rate: " + payRate[index]);
            empPayroll.println("Regular Hours Worked: " + regularHours);
            empPayroll.println("Overtime Hours Worked: " + overtimeHours);
            empPayroll.println("Regular Pay: " + regularPay);
            empPayroll.println("Overtime Pay: " + overtimePay);
            empPayroll.println("Total Gross Pay: " + totalPay);
        }
        empPayroll.close();
         
    }
     
    public void quitApplication()
    {
        Platform.exit(); //Close application
    }
     
    public static void main(String[] args)
    {
        launch(args);
    }
}
