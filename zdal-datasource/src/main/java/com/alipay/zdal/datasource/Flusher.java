package com.alipay.zdal.datasource;

import java.util.Map;

/**
 *   ����Դˢ������ͨ�������µ�����Դ��������������
 * 
 * @author liangjie
 * @version $Id: Flusher.java, v 0.1 2012-7-18 ����10:21:19 liangjie Exp $
 */
public interface Flusher {

    /**
     *  ���ݾ�������ʵ������ˢ������Դ
     * 
     * @param localTxDataSourceDO
     * @return
     */
    //    public boolean flush(LocalTxDataSourceDO localTxDataSourceDO);

    /**
     * ��������mapˢ������Դ
     * 
     * @param map
     * @return
     */
    boolean flush(Map<String, String> map);

}