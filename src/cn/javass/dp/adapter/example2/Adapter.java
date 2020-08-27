package cn.javass.dp.adapter.example2;

import cn.javass.dp.adapter.example2.LogModel;

import java.util.List;

public class Adapter implements LogDbOperateApi {

    private LogFileOperateApi adaptee;

    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public void createLog(LogModel logModel) {
        List<LogModel> list = adaptee.readLogFile();
        list.add(logModel);
        adaptee.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel logModel) {
        List<LogModel> list = adaptee.readLogFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLogId().equals(logModel.getLogId())) {
                list.set(i, logModel);
                break;
            }
        }
        adaptee.writeLogFile(list);
    }

    @Override
    public void removeLog(LogModel logModel) {
        List<LogModel> list = adaptee.readLogFile();
        list.remove(logModel);
        adaptee.writeLogFile(list);


    }

    @Override
    public List<LogModel> getAllLog() {
        return adaptee.readLogFile();
    }
}
