package stepdefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitions {

    public Family family;
    public ObjectMapper objmapper=new ObjectMapper();

    @Given("I create family entity")
    public void i_create_family_entity() {
     family = new Family();
    }

    @Given("I add name1")
    public void i_add_name1() {
        family.setName1("Ramanan");
    }
    @Given("I add name2")
    public void i_add_name2() {
        family.setName2("Preetha");
    }
    @Given("I add name3")
    public void i_add_name3() {
        family.setName3("Nidhilaa");
    }

    @Then("I print name1")
    public void i_print_name1() {
        System.out.println("===================OutPut Started=================");
        System.out.println(family.getName1());
        System.out.println("===================OutPut Ended=================");
    }

    @Then("I print name2")
    public void i_print_name2() {
        System.out.println("===================OutPut Started=================");
        System.out.println(family.getName2());
        System.out.println("===================OutPut Ended=================");
    }

    @Then("I print name3")
    public void i_print_name3() {
        System.out.println("===================OutPut Started=================");
        System.out.println(family.getName3());
        System.out.println("===================OutPut Ended=================");
    }

    @Then("I print \"([^]*)\"")
    public void i_print_whole_names(String name) {
        System.out.println("===================OutPut Started=================");
        if(name.toLowerCase().equals("name1")){
            System.out.println(family.getName1());
        }else if(name.toLowerCase().equals("name2")){
            System.out.println(family.getName2());
        }else{
            System.out.println(family.getName3());
        }
        System.out.println("===================OutPut Ended=================");
    }

    @Then("print whole object")
    public void i_print_object_value() throws JsonProcessingException {
        System.out.println("===================OutPut Started=================");
        System.out.println(family.getName1());
        System.out.println(family.getName2());
        System.out.println(family.getName3());
        System.out.println(family.toString());
        System.out.println(objmapper.writerWithDefaultPrettyPrinter().writeValueAsString(family.toString()));
        System.out.println("===================OutPut Ended=================");
    }

}
