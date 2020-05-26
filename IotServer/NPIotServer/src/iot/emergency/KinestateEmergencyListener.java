package iot.emergency;

import iot.observer.Event;
import iot.observer.EventListener;
import iot.pojo.RingRecord;
import iot.pojo.RingRecordAdaptor;

public class KinestateEmergencyListener implements EventListener {

    @Override
    public void notify(Event e) {
        RingRecord record = ((RingRecordAdaptor)e).getRecord();
        // TODO ��̬�쳣�߼�
        System.out.println("[-- Emergency --] KinestateEmergencyListener:" + record.getKinestat().toString());
    }

}
