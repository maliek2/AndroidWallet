package com.cocos.module_asset.entity;

import android.graphics.drawable.Drawable;

import com.cocos.library_base.entity.BaseResult;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ningkang.guo
 * @Date 2019/2/20
 */

@Setter
@Getter
public class DealRecordModel extends BaseResult {

    public List<DealRecordItemModel> data;

    public static class DealRecordItemModel implements Serializable {
        public int block_num;
        public String id;
        public int op_in_trx;
        public int trx_in_block;
        public int virtual_op;
        public List<Object> op;
        public List<Object> result;
        public Drawable drawableImg;
    }

    public static class OpBean implements Serializable {
        public FeeBean fee;
        public String from;
        public String to;
        public AmountBean amount;
        public MemoBean memo;

        public static class FeeBean implements Serializable {
            public BigDecimal amount;
            public String asset_id;
        }

        public static class AmountBean implements Serializable {
            public BigDecimal amount;
            public String asset_id;
        }

        public static class MemoBean implements Serializable {
            public String from;
            public String to;
            public String nonce;
            public String message;
        }
    }
}