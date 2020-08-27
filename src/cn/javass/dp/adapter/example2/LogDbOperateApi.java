package cn.javass.dp.adapter.example2;

import cn.javass.dp.adapter.example2.LogModel;

import java.util.List;

public interface LogDbOperateApi {

    public void createLog(LogModel logModel);

    public void updateLog(LogModel logModel);

    public void removeLog(LogModel logModel);

    public List<LogModel> getAllLog();
}
