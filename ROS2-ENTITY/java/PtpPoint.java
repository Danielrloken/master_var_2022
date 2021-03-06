package kmr.test;

import com.kuka.roboticsAPI.deviceModel.JointPosition;
import com.kuka.roboticsAPI.motionModel.PTP;


public class PtpPoint{
	PTP ptppoint;
	String pointtype;
	
	public PtpPoint(String type, JointPosition jp, double[] vel, double[] acc){
		ptppoint = new PTP(jp);
		ptppoint.setJointVelocityRel(vel);
		ptppoint.setJointAccelerationRel(acc);
		pointtype = type;
	}
	
	
	public PTP getPTP(){
		return ptppoint;
	}
	
	public String getPointType(){
		return pointtype;
	}
	

	
	}