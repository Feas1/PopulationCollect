package com.haoweifukai.LiuDongRenKouCaijiGuanLi.providers;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * <b>便携法规分目录</b>
 * <br>
 * 保存便携法规分目录。
 */
public class C_BXFGK_ML2 implements BaseColumns {

    public static final Uri CONTENT_URI = Uri.parse("content://"
            + MyContentProvider.AUTHORITY + "/" + MyContentProvider.BIANXIEFAGUIKU_MULU2_TABLE_NAME);

    public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.dictionary.bxfgk_ml2";

    /**
     * 二级目录ID：     MLID、VC/60、非空、主键；
     */
    public static final String MLID = "MLID";
    /**
     * 目录名称：		   MLMC、VC/60、非空；
     */
    public static final String MLMC = "MLMC";
    /**
     * 一级目录ID：     YJMLID、VC/60、非空、主键；
     */
    public static final String YJMLID = "YJMLID";

}
