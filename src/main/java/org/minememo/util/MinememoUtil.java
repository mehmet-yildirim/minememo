package org.minememo.util;

/**
 * Created by Mehmet on 09.02.2015.
 */
public class MinememoUtil {
    
    public static MinememoUtil.EnumOS getOSType()
    {
        String osName = System.getProperty("os.name").toLowerCase();
        return   osName.contains("win") ? EnumOS.WINDOWS :
                (osName.contains("mac") ? EnumOS.OSX :
                (osName.contains("linux") ? EnumOS.LINUX : 
                (osName.contains("unix") ? EnumOS.LINUX :
                (osName.contains("solaris") ? EnumOS.SOLARIS : 
                (osName.contains("sunos") ? EnumOS.SOLARIS : 
                 EnumOS.UNKNOWN
                )))));
    }
    
    public static enum EnumOS
    {
        LINUX("LINUX", 0),
        SOLARIS("SOLARIS", 1),
        WINDOWS("WINDOWS", 2),
        OSX("OSX", 3),
        UNKNOWN("UNKNOWN", 4);
        
        private static final MinememoUtil.EnumOS[] $VALUES = new MinememoUtil.EnumOS[]{LINUX, SOLARIS, WINDOWS, OSX, UNKNOWN};
        private EnumOS(String osName, int ordinal){}
    
    }
}
