package com.example.week3_2023_03;
/*<item name="USA" key="USA"  id="USA"> Unites State of America</item>
     <item name="bra"  key="bra" id="bra" > Brazil</item>
     <item name="tr"  key="tr" id="tr"> Turkiye</item>
     <item name="eg" key="eg" id="eg"> Egypt</item>*/

import org.w3c.dom.Text;

public class MyWrapper {
    public String id;
    public String name;
    public String key;
    public String text;
    public MyWrapper(String id, String name,String key, String Text){
        this.id= id;
        this.name=name;
        this.key=key;
        this.text=Text;


    }

   public String toString(){
       return text;
    }
}
