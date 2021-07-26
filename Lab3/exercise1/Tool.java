/**
 * Tool
 */

public class Tool {
    private String id, name, quantity, price, supplier_id, company, address, sales_contact;

    /**
     * Tool will contain the info for each tool in the shop
     * @param id
     * @param name
     * @param quantity
     * @param price
     * @param supplier_id
     * @param company
     * @param address
     * @param sales_contact
     */

    public Tool(String a , String b, String c, String d, String e, String f, String g, String h){
        id = a;
        name = b;
        quantity = c;
        price = d;
        supplier_id = e;
        company = f;
        address = g;
        sales_contact = h;
    }
    /**
     * used to retrieve the id of the tool object
     * @return id of the tool
     */
    public String getID() { return id; }
    public String getName() { return name; }
    public String getQuantity() { return quantity; }
    public String getPrice() { return price; }
    public String getSupplierID() { return supplier_id; }
    public String getCompany() { return company; }
    public String getAddress() { return address; }
    public String getSalesContact() { return sales_contact; }

    /**
     * sets the value of the 
     * @param info to be replaced
     * @param value the info is being replaced by
     */
    public void setValue(int index, String str) { 
        if(index == 0){id=str;}
        if(index == 1){name=str;}
        if(index == 2){quantity=str;}
        if(index == 3){price=str;}
        if(index == 4){supplier_id=str;}
        if(index == 5){company=str;}
        if(index == 6){address=str;}
        if(index == 7){sales_contact=str;}
    }

    public void decreaseQuantity() {
        quantity = String.valueOf(Integer.parseInt(quantity) - 1);
    }

}
