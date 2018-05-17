/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testignore2;

/**
 *
 * @author exk
 */
public class uStudent {

    /**
     * Student Id
     */
    private Integer xId;

    /**
     * Student First Name
     */
    private String vFirstName;

    /**
     * Constructor with default init values
     *
     * @param xId
     * @param vFirstName
     */
    public uStudent(Integer xId, String vFirstName) {
        this.xId = xId;
        this.vFirstName = vFirstName;
    }

    /**
     * Default constructor
     */
    public uStudent() {
    }

    /**
     * Student Id
     * @return the xId
     */
    public Integer getxId() {
        return xId;
    }

    /**
     * Student Id
     * @param xId the xId to set
     */
    public void setxId(Integer xId) {
        this.xId = xId;
    }

    /**
     * Student First Name
     * @return the vFirstName
     */
    public String getvFirstName() {
        return vFirstName;
    }

    /**
     * Student First Name
     * @param vFirstName the vFirstName to set
     */
    public void setvFirstName(String vFirstName) {
        this.vFirstName = vFirstName;
    }
    
    

}
