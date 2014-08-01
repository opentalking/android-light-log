package org.opentalking.lightlog;

import android.annotation.SuppressLint;
import android.util.Log;

public final class ILog{
	
	private static final boolean NEEDLOGS = BuildConfig.DEBUG;
	private static final int FAILURECODE = -1;
	
	enum LogType{
		V,D,I,W,E,A
	}
	
	public static boolean isNeedLogs() {
		return NEEDLOGS;
	}
	
    private ILog(){
    		 
    }
    //repeat these type is wtf
    // verbose
    public static int v(String msg) {
    		return v(null,msg,null);
    }
    
    public static int v(Throwable tr) {
    		return v(null,null,tr);
    }
    
    public static int v(String msg, Throwable tr) {
    		return v(null,msg,tr);
    }
    
    public static int v(String tag, String msg) {
        return v(tag,msg,null);
    }
    
    public static int v(String tag, String msg, Throwable tr) {
        return print_log(LogType.V,tag,msg,tr);
    }
    //debug
    public static int d(String msg) {
    		return d(null,msg,null);
    }
    
    public static int d(Throwable tr) {
    		return d(null,null,tr);
    }
    
    public static int d(String msg, Throwable tr) {
    		return d(null,msg,tr);
    }
    
    public static int d(String tag, String msg) {
    		return d(tag,msg,null);
    }
    
    public static int d(String tag, String msg, Throwable tr) {
    		return print_log(LogType.D,tag,msg,tr);
    }
    //info
    public static int i(String msg) {
    		return i(null,msg,null);
    }
    
    public static int i(Throwable tr) {
    		return i(null,null,tr);
    }
    
    public static int i(String msg, Throwable tr) {
    		return i(null,msg,tr);
    }
    
    public static int i(String tag, String msg) {
    		return i(tag,msg,null);
    }
    
    public static int i(String tag, String msg, Throwable tr) {
    		return print_log(LogType.I,tag,msg,tr);
    }
    //warn
    public static int w(String msg) {
    		return w(null,msg,null);
    }
    
    public static int w(Throwable tr) {
    		return w(null,null,tr);
    }
    
    public static int w(String msg, Throwable tr) {
    		return w(null,msg,tr);
    }
    
    public static int w(String tag, String msg) {
    		return w(tag,msg,null);
    }
    
    public static int w(String tag, String msg, Throwable tr) {
    		return print_log(LogType.W,tag,msg,tr);
    }
    //error
    public static int e(String msg) {
    		return e(null,msg,null);
    }
    
    public static int e(Throwable tr) {
    		return e(null,null,tr);
    }
    
    public static int e(String msg, Throwable tr) {
    		return e(null,msg,tr);
    }
    
    public static int e(String tag, String msg) {
    		return e(tag,msg,null);
    }
    
    public static int e(String tag, String msg, Throwable tr) {
    		return print_log(LogType.E,tag,msg,tr);
    }
    //assert
    public static int wtf(String msg) {
    		return wtf(null,msg,null);
    }
    
    public static int wtf(Throwable tr) {
    		return wtf(null,null,tr);
    }
    
    public static int wtf(String msg, Throwable tr) {
    		return wtf(null,msg,tr);
    }
    
    public static int wtf(String tag, String msg) {
    		return wtf(tag,msg,null);
    }
    
    public static int wtf(String tag, String msg, Throwable tr) {
    		return print_log(LogType.A,tag,msg,tr);
    }

	@SuppressLint("DefaultLocale")
	private static int print_log(LogType type, String tag, String msg, Throwable thr) {
		
		if (!isNeedLogs()){
			return FAILURECODE;
		}
		
		Throwable throwable = new Throwable();
		StackTraceElement[] stackTrace = throwable.getStackTrace();
		
		String className = stackTrace[1].getFileName();
		String methodName = stackTrace[1].getMethodName();
		int lineNumber = stackTrace[1].getLineNumber();
		
		String tagStr = (tag == null ? className:tag);
		
		methodName = methodName.substring(0,1).toUpperCase() + methodName.substring(1);
		
		StringBuilder prefixBuilder = new StringBuilder();
		prefixBuilder.append("[")
		.append(methodName)
		.append(":")
		.append(lineNumber)
		.append("]  ");
		
		if(msg != null){
			prefixBuilder.append(msg);
		}
		
		String msgStr = prefixBuilder.toString();
		
		if(type == LogType.V){
			if(thr != null){
				return Log.v(tagStr, msgStr , thr);
			}else{
				return Log.v(tagStr, msgStr);
			}
		}
		
		if(type == LogType.D){
			if(thr != null){
				return Log.d(tagStr, msgStr , thr);
			}else{
				return Log.d(tagStr, msgStr);
			}
		}
		
		if(type == LogType.I){
			if(thr != null){
				return Log.i(tagStr, msgStr , thr);
			}else{
				return Log.i(tagStr, msgStr);
			}
		}
		
		if(type == LogType.W){
			if(thr != null){
				return Log.w(tagStr, msgStr , thr);
			}else{
				return Log.w(tagStr, msgStr);
			}
		}
		
		if(type == LogType.E){
			if(thr != null){
				return Log.e(tagStr, msgStr , thr);
			}else{
				return Log.e(tagStr, msgStr);
			}
		}
		
		if(type == LogType.A){
			if(thr != null){
				return Log.wtf(tagStr, msgStr , thr);
			}else{
				return Log.wtf(tagStr, msgStr);
			}
		}
		
		return FAILURECODE;
	}

}
