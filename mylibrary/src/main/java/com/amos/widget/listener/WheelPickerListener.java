package com.amos.widget.listener;

import com.amos.widget.bean.DateBean;
import com.amos.widget.bean.DateType;

/**
 * @Description: 监听类
 * @Author: Amos
 * @CreateDate: 2020/4/2 13:20
 * @UpdateUser: 更新者：
 * @UpdateDate: 2020/4/2 13:20
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */

public interface WheelPickerListener {
     void onSelect(DateType type, DateBean bean);
}
