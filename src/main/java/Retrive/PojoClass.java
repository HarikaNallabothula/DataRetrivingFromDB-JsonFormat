package Retrive;

import java.sql.Date;

public class PojoClass {
	
	private int equip_id;
    private  String type;
	private  String color;
    private   String location;
    private Date install_date;
               public int getEquip_id() {
					return equip_id;
				}
				public void setEquip_id(int equip_id) {
					this.equip_id = equip_id;
									}
				public String getType() {
					return type;
				}
				public void setType(String type) {
					this.type = type;
				}
				public String getColor() {
					return color;
				}
				public void setColor(String color) {
					this.color = color;
				}
				public String getLocation() {
					return location;
				}
				public void setLocation(String location) {
					this.location = location;
				}
				public Date getInstall_date() {
					return install_date;
				}
				public void setInstall_date(Date install_date) {
					this.install_date = install_date;
				}}