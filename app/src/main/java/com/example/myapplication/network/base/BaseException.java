package com.example.myapplication.network.base;

import android.content.Context;
import android.util.Log;

public class BaseException extends Throwable {

    private Context context;

    private String tag;
    private int level = Log.INFO;
    private int mensagemId;

    private String localizedMessage; // sobrescrevendo atributo da classe pai para poder setar valor nele sem ser pelo construtor

    public BaseException(Context context, String tag, int mensagemId) {
        super();
        this.context = context;
        this.tag = tag;
        this.mensagemId = mensagemId;
        this.logar();
    }

    public BaseException(Context context, String tag, int mensagemId, Throwable cause) {
        super(cause);
        this.context = context;
        this.tag = tag;
        this.mensagemId = mensagemId;
        this.logar();
    }

    public BaseException(Context context, String tag, int mensagemId, int level) {
        super();
        this.context = context;
        this.tag = tag;
        this.level = level;
        this.mensagemId = mensagemId;
        this.logar();
    }

    public BaseException(Context context, String tag, int mensagemId, Throwable cause, int level) {
        super(cause);
        this.context = context;
        this.tag = tag;
        this.level = level;
        this.mensagemId = mensagemId;
        this.logar();
    }

    private void logar() {
        this.localizedMessage = context.getString(mensagemId);
//        if (Utilidade.DEBUG) {
//            Log.println(level, tag, localizedMessage);
//        }
    }

    public String getLocalizedMessage() {
        return localizedMessage;
    }

    public void setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
    }
}