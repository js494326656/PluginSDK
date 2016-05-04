package com.jsware.pluginsdk;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

import com.jsware.dynamiclib.IDynamic;

/**
 * Created by 1 on 2016/5/4.
 */
public class Dynamic implements IDynamic {
    @Override
    public void showDialog(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage("对话框");
        builder.setTitle(R.string.app_name);
        builder.setNegativeButton("取消", new Dialog.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        Dialog dialog = builder.create();//.show();
        dialog.show();
    }
}
