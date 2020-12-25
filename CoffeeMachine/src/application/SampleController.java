package application;

import com.coffeemachine.models.Technician;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


 public class SampleController {
	

	    @FXML
	    private Button btnadd;
	
	   @FXML
	    private TextField id;

	    @FXML
	    private TextField name;

	    @FXML
	    private TextField phone;

	    @FXML
	    private TextField idref;

	    @FXML
	    private TextField acesscode;
	    
	    @FXML
	    private TableView<Technician> tableView;
	    
	    @FXML
	    private TableColumn<Technician, Integer> id1;

	    @FXML
	    private TableColumn<Technician, String> name1;

	    @FXML
	    private TableColumn<Technician, String> phone1;

	    @FXML
	    private TableColumn<Technician, String> idref1;

	    @FXML
	    private TableColumn<Technician, String> access1;
	    
	    public void addtechnician() {
	    	
	    	int Id =Integer.parseInt(id.getText());
			String Name = name.getText();
			String Phone = phone.getText();
			String Idref = idref.getText();
			String Acess = acesscode.getText();
			
			  id1.setCellValueFactory(new PropertyValueFactory<>("id"));
		        name1.setCellValueFactory(new PropertyValueFactory<>("name"));
		        phone1.setCellValueFactory(new PropertyValueFactory<>("phone"));
		        idref1.setCellValueFactory(new PropertyValueFactory<>("id ref"));
		        access1.setCellValueFactory(new PropertyValueFactory<>("access code"));
		
			Technician technician = new Technician(Id, Name, Phone, Idref, Acess);
			tableView.getItems().add(technician);
		}

	    

	
	
    
    
	

	}
