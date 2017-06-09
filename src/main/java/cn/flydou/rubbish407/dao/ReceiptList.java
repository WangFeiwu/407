package cn.flydou.rubbish407.dao;

import org.apache.ibatis.annotations.Param;
import cn.flydou.rubbish407.entity.Receipt;
/**
 * Created by wanchenqi on 2017/6/8.
 */
public interface ReceiptList {
    Receipt showReceiptById(@Param("id") int id);

    Receipt showReceiptByReceiptId(@Param("userId") int receiptId);

    public void insertNewReceipt(Receipt receipt);

    public void deleteReceiptById(Receipt receipt);

    public void deleteReceiptByReceiptId(Receipt receipt);

    public void updateReceiptList(Receipt receipt);
}
