package iot.emergency;

import iot.pojo.RingRecord;

public class PhysicalEmergencyListener extends EmergencyListener {

    @Override
    protected EmergencyEvent getEmergency(RingRecord record) {
        EmergencyEvent emergency = new EmergencyEvent();
        //TODO ������������쳣��Ϣ
        return emergency;
    }

    @Override
    protected boolean abnormal(RingRecord record) {
      //TODO ��������쳣�ж�
        return false;
    }

}
