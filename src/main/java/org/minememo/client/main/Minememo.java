package org.minememo.client.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.minememo.util.MinememoUtil;

/**
 * Created by Mehmet on 09.02.2015.
 */
public class Minememo {
    
    private static final Logger logger = LogManager.getLogger();
    public static final boolean isDarwin = MinememoUtil.getOSType() == MinememoUtil.EnumOS.OSX;
    
    volatile boolean running = true;
}
