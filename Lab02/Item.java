package com.mycompany.item;
public class Item 
{
    private int location;
    private String description;
    public void SetVal(int location,String description)
    {
        this.location=location;
        this.description=description;
    }
    public int getLocation()
    {
        return location;
    }
    public void setLocation(int location)
    {
        this.location=location;
    }
     public String getDescription()
    {
        return description;
    }
    public void setDescription(String location)
    {
        this.description=description;
    }
}  
