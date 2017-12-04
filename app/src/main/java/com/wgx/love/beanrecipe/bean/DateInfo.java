package com.wgx.love.beanrecipe.bean;

/**
 * Created by imotor on 17-12-4.
 */

public class DateInfo {

        /**
         * date : 2015-01-01
         * gonli : 2015年1月1日,星期四
         * nian : 甲午【马】年
         * yueri : 甲子月　壬申日
         * yi : 祭祀 祈福 会友 出行 就职 订婚 纳采 结婚 搬家 入宅 沐浴 求医 动工 酝酿 签约 交易 纳财 清扫 栽种 纳畜 安葬
         * ji : 理发
         * xingzuo : 摩羯座
         * ri : 1
         * wx : 长流水　海中金　剑锋金
         * shengxiao : 马
         */

        private String date;
        private String gonli;
        private String nian;
        private String yueri;
        private String yi;
        private String ji;
        private String xingzuo;
        private String ri;
        private String wx;
        private String shengxiao;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getGonli() {
            return gonli;
        }

        public void setGonli(String gonli) {
            this.gonli = gonli;
        }

        public String getNian() {
            return nian;
        }

        public void setNian(String nian) {
            this.nian = nian;
        }

        public String getYueri() {
            return yueri;
        }

        public void setYueri(String yueri) {
            this.yueri = yueri;
        }

        public String getYi() {
            return yi;
        }

        public void setYi(String yi) {
            this.yi = yi;
        }

        public String getJi() {
            return ji;
        }

        public void setJi(String ji) {
            this.ji = ji;
        }

        public String getXingzuo() {
            return xingzuo;
        }

        public void setXingzuo(String xingzuo) {
            this.xingzuo = xingzuo;
        }

        public String getRi() {
            return ri;
        }

        public void setRi(String ri) {
            this.ri = ri;
        }

        public String getWx() {
            return wx;
        }

        public void setWx(String wx) {
            this.wx = wx;
        }

        public String getShengxiao() {
            return shengxiao;
        }

        public void setShengxiao(String shengxiao) {
            this.shengxiao = shengxiao;
        }

    @Override
    public String toString() {
        return "DateInfo{" +
                "date='" + date + '\'' +
                ", gonli='" + gonli + '\'' +
                ", nian='" + nian + '\'' +
                ", yueri='" + yueri + '\'' +
                ", yi='" + yi + '\'' +
                ", ji='" + ji + '\'' +
                ", xingzuo='" + xingzuo + '\'' +
                ", ri='" + ri + '\'' +
                ", wx='" + wx + '\'' +
                ", shengxiao='" + shengxiao + '\'' +
                '}';
    }
}
