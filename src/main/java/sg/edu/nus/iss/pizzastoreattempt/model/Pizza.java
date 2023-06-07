package sg.edu.nus.iss.pizzastoreattempt.model;

import java.io.Serializable;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class Pizza implements Serializable{
    
    @NotNull(message="Please select a pizza")
    private String pizza;

    @NotNull(message="Please select the size of the pizza")
    private String size;

    @Min(value=1, message="Must order at least one pizza")
    @Max(value=10, message="Can only order 10pizzas")
    private int quantity;

    public String getPizza() {
        return pizza;
    }
    public void setPizza(String pizza) {
        this.pizza = pizza;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
}
