package uk.gov.tax.testleafnew.data.TestLeaf_TestData;

import java.io.Serializable;

public class Travelerinformation implements Serializable {

    private int id;
    private String name;
    private String email;
    private String adderes;
    private String createdat;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("************************************");
        sb.append("\nid: ").append(id);
        sb.append("\nname: ").append(name);
        sb.append("\nemail: ").append(email);
        sb.append("\nadderes: ").append(adderes);
        sb.append("\ncreatedat: ").append(createdat);
        sb.append("\n************************************");
        return sb.toString();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdderes() {
        return adderes;
    }

    public void setAdderes(String adderes) {
        this.adderes = adderes;
    }

    public String getCreatedat() {
        return createdat;
    }

    public void setCreatedat(String createdat) {
        this.createdat = createdat;
    }


}
