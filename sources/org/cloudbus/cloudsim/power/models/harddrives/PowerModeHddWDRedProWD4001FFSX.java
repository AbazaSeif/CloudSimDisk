/*
 * Title: CloudSim EES Extention Description: CloudSim extention for Energy Efficient Storage Licence: GPL -
 * http://www.gnu.org/copyleft/gpl.html Copyright (c) 2015, Luleå University of Techonology
 */
package org.cloudbus.cloudsim.power.models.harddrives;

/**
 * The power model of a WD Red Pro WD4001FFSX.
 * 
 * Info source: http://www.storagereview.com/wd_red_pro_review_4tb_nasware_30
 * 
 * @author Baptiste Louis
 */
public class PowerModeHddWDRedProWD4001FFSX extends PowerModelHdd {
	
	/**
	 * The power consumption of the HDD in idle mode in W.
	 */
	private final double	powerIdle	= 6.5;
	
	/**
	 * The power consumption of the HDD in active mode in W.
	 */
	private final double	powerOpe	= 8.6;
	
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
