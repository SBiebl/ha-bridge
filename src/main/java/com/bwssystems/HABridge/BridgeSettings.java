package com.bwssystems.HABridge;

import java.util.List;

public class BridgeSettings {
	private String upnpconfigaddress;
	private String serverport;
	private String upnpresponseport;
	private String upnpdevicedb;
	private IpList veraaddress;
	private IpList harmonyaddress;
	private String harmonyuser;
	private String harmonypwd;
	private Integer buttonsleep;
	private boolean upnpstrict;
	private boolean traceupnp;
	private boolean devmode;
	private String nestuser;
	private String nestpwd;
	private boolean nestconfigured;
	private String configfile;
	private boolean restart;
	private boolean stop;
	
	public String getUpnpConfigAddress() {
		return upnpconfigaddress;
	}
	public void setUpnpConfigAddress(String upnpConfigAddress) {
		this.upnpconfigaddress = upnpConfigAddress;
	}
	public String getServerPort() {
		return serverport;
	}
	public void setServerPort(String serverPort) {
		this.serverport = serverPort;
	}
	public String getUpnpResponsePort() {
		return upnpresponseport;
	}
	public void setUpnpResponsePort(String upnpResponsePort) {
		this.upnpresponseport = upnpResponsePort;
	}
	public String getUpnpDeviceDb() {
		return upnpdevicedb;
	}
	public void setUpnpDeviceDb(String upnpDeviceDb) {
		this.upnpdevicedb = upnpDeviceDb;
	}
	public IpList getVeraAddress() {
		return veraaddress;
	}
	public void setVeraAddress(IpList veraAddress) {
		this.veraaddress = veraAddress;
	}
	public IpList getHarmonyAddress() {
		return harmonyaddress;
	}
	public void setHarmonyAddress(IpList harmonyaddress) {
		this.harmonyaddress = harmonyaddress;
	}
	public String getHarmonyUser() {
		return harmonyuser;
	}
	public void setHarmonyUser(String harmonyuser) {
		this.harmonyuser = harmonyuser;
	}
	public String getHarmonyPwd() {
		return harmonypwd;
	}
	public void setHarmonyPwd(String harmonypwd) {
		this.harmonypwd = harmonypwd;
	}
	public boolean isUpnpStrict() {
		return upnpstrict;
	}
	public void setUpnpStrict(boolean upnpStrict) {
		this.upnpstrict = upnpStrict;
	}
	public boolean isTraceupnp() {
		return traceupnp;
	}
	public void setTraceupnp(boolean traceupnp) {
		this.traceupnp = traceupnp;
	}
	public boolean isDevMode() {
		return devmode;
	}
	public void setDevMode(boolean devmode) {
		this.devmode = devmode;
	}
	public String getNestuser() {
		return nestuser;
	}
	public void setNestuser(String nestuser) {
		this.nestuser = nestuser;
	}
	public String getNestpwd() {
		return nestpwd;
	}
	public void setNestpwd(String nestpwd) {
		this.nestpwd = nestpwd;
	}
	public boolean isNestConfigured() {
		return nestconfigured;
	}
	public void setNestConfigured(boolean isNestConfigured) {
		this.nestconfigured = isNestConfigured;
	}
	public Integer getButtonsleep() {
		return buttonsleep;
	}
	public void setButtonsleep(Integer buttonsleep) {
		this.buttonsleep = buttonsleep;
	}
	public boolean isRestart() {
		return restart;
	}
	public void setRestart(boolean restart) {
		this.restart = restart;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	public String getConfigfile() {
		return configfile;
	}
	public void setConfigfile(String configfile) {
		this.configfile = configfile;
	}
	public Boolean isValidVera() {
		List<NamedIP> devicesList = this.veraaddress.getDevices();
		if(devicesList.get(0).getIp().contains(Configuration.DEFAULT_ADDRESS))
			return false;
		return true;
	}
	public Boolean isValidHarmony() {
		List<NamedIP> devicesList = this.harmonyaddress.getDevices();
		if(devicesList.get(0).getIp().contains(Configuration.DEFAULT_ADDRESS))
			return false;
		if(this.harmonypwd == null || this.harmonypwd == "")
			return false;
		if(this.harmonyuser == null || this.harmonyuser == "")
			return false;
		return true;
	}
	public Boolean isValidNest() {
		if(this.nestpwd == null || this.nestpwd == "")
			return false;
		if(this.nestuser == null || this.nestuser == "")
			return false;
		return true;
	}
}
