/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.maxgigapop.versans.nps.device;

/**
 *
 * @author xyang
 */
public class Interface implements java.io.Serializable  {
    int id = 0;
    String urn = "";
    String makeModel = "";
    int deviceId = 0;
    String description = "";
    String aliasUrn = null;
    Device parentDevice = null;

    public Interface() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public String getAliasUrn() {
        return aliasUrn;
    }

    public void setAliasUrn(String aliasUrn) {
        this.aliasUrn = aliasUrn;
    }

    public Device getParentDevice() {
        return parentDevice;
    }

    public void setParentDevice(Device parentDevice) {
        this.parentDevice = parentDevice;
    }
}
