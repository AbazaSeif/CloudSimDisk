/*
 * Title: CloudSim EES Extention Description: CloudSim extention for Energy Efficient Storage Licence: GPL -
 * http://www.gnu.org/copyleft/gpl.html Copyright (c) 2015, Luleå University of Techonology
 */
package org.cloudbus.cloudsim.power.models.harddrives;

/**
 * The power model of a HGST Ultrastar C10K900.
 * 
 * Info source: http://www.storagereview.com/hgst_ultrastar_c10k900_review
 * 
 * @author Baptiste Louis
 */
public class PowerModeHddHGSTUltrastarC10K900 extends PowerModelHdd {
	
	/**
	 * The power consumption of the HDD in idle mode in W.
	 */
	private final double	powerIdle	= 3.0;
	
	/**
	 * The power consumption of the HDD in active mode in W.
	 */
	private final double	powerOpe	= 5.8;
	
	/*
	 * (non-Javadoc)
	 * @see org.cloudbus.cloudsim.power.models.harddrives.PowerModelHdd#getPowerData(int)
	 */
	@SuppressWarnings("javadoc")
	@Override
	protected double getPowerData(
			int key) {
		if (key == 0) {
			return powerIdle;
		} else {
			return powerOpe;
		}
	}
	
}
