package iot.emergency;

import iot.observer.Event;
import iot.observer.EventListener;
import iot.pojo.RingRecord;
import iot.pojo.RingRecordAdaptor;

public class KeyEventEmergencyListener implements EventListener {

    @Override
    public void notify(Event e) {
        RingRecord record = ((RingRecordAdaptor)e).getRecord();
        // TODO ������������
        System.out.println("[-- Emergency --] KeyEventEmergencyListener:" + record.getKeyEvent().toString());
    }

}
