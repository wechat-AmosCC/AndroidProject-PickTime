package com.amos.widget.listener;

import com.amos.widget.bean.DateBean;
import com.amos.widget.bean.DateType;

/**
 * Created by codbking on 2016/9/22.
 */

public interface WheelPickerListener {
     void onSelect(DateType type, DateBean bean);
}
