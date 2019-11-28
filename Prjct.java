/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication59;

/**
 *
 * @author timothyblajsa
 */
public class Prjct {
 
    int[] Areas;
    String zone;
    String city;
    
public String getZone(int []Areas){
    int i;
    for( i = 0; i < Areas.length; i++ )
    if(Areas[i] == 201 || Areas[i] == 551){
        zone = "burgandy";
    }
    else if(Areas[i] == 609 || Areas[i] == 640){
        zone = "green";
    }
    else if(Areas[i] == 732 || Areas[i] == 848){
        zone = "light blue";
    }
    else if(Areas[i] == 856){
        zone = "red";
    }
    else if(Areas[i] == 973 || Areas[i] == 862){
        zone = "purple";
    }
    else if(Areas[i] == 908){
        zone = "blue";
    }
    else if(Areas[i] > 999){
        zone = "*special case*";
    }
    
        return zone;
}
public String getCity(String zone){
    
if(zone == "burgandy"){
        city = "Bergen and Hudson County";
    }
    else if(zone == "green"){
        city = "Trenton, Lawrenceville, Princeton, Medford, AC, Barnegat, Wildwood, OC, Burlington, CM";
    }
    else if(zone == "light blue"){
        city = "TR, Edison, New Brunswick, Freehold, Red Bank, Woodbridge, Perth AMboy, Carteret";
    }
    else if(zone == "red"){
        city = "Camden, Cherry Hill, Glassboro, Vineland, Salem, Marlton, Clayton, Monroeville";
    }
    else if(zone == "purple"){
        city = "Elizabeth and Union County, Somerset County, Warren County, Hunterdon County, parts of southern and western Morris County";
    }
    else if(zone == "blue"){
        city = "Essex county, Passaic County, Morris County, Sussex County, and small parts of Bergen and Hudson County";
    }
    else if(zone == "*special case*"){
        city = "*special case*";
    }
    else
        city = "outside of NJ";
    return city;
}
    
    
}

    
