package iot.emergency;

import iot.pojo.RingRecord;

public class KinestateEmergencyListener extends EmergencyListener {

    @Override
    protected EmergencyEvent getEmergency(RingRecord record) {
        EmergencyEvent emergency = new EmergencyEvent();
        //TODO ������������쳣��Ϣ
        return emergency;
    }

    @Override
    protected boolean abnormal(RingRecord record) {
        // TODO �ж���̬�쳣�߼�
        return false;
    }

}
