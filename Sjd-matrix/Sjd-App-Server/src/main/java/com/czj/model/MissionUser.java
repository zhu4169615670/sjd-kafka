package com.czj.model;


import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 *用戶
 */
@Data
@Entity
@Table(name = "mission_user")
public class MissionUser implements Serializable {
    /**
     * 编号
     *
     * @mbg.generated
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    /**
     * 手机
     *
     * @mbg.generated
     */
    private String phone;

    /**
     * 头像
     *
     * @mbg.generated
     */
    private String avatar;

    /**
     * 令牌
     *
     * @mbg.generated
     */
    private String token;

    /**
     * 昵称
     *
     * @mbg.generated
     */
    private String nickname;

    /**
     * 性别(0:未知,1:男,2:女)
     *
     * @mbg.generated
     */
    private Byte sex;

    /**
     * 城市
     *
     * @mbg.generated
     */
    private String city;

    /**
     * 省
     *
     * @mbg.generated
     */
    private String province;

    /**
     * 国家
     *
     * @mbg.generated
     */
    private String country;

    /**
     * 真实姓名
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 身份证号码
     *
     * @mbg.generated
     */
    private String cardNo;

    /**
     * 身份证正面
     *
     * @mbg.generated
     */
    private String cardPositive;

    /**
     * 身份证反面
     *
     * @mbg.generated
     */
    private String cardOther;

    /**
     * 是否实名认证
     *
     * @mbg.generated
     */
    private Byte isTrue;

    /**
     * 状态
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     * 籍贯
     *
     * @mbg.generated
     */
    private String nativePlace;

    /**
     * 爱好
     *
     * @mbg.generated
     */
    private String hobby;

    /**
     * 个性签名
     *
     * @mbg.generated
     */
    private String signature;

    /**
     * 上级编号2
     *
     * @mbg.generated
     */
    private Integer hSecId;

    /**
     * 上级编号
     *
     * @mbg.generated
     */
    private Integer hId;

    /**
     * 设备号
     *
     * @mbg.generated
     */
    private String devNo;

/*    *//**
     * 注册时间
     *
     * @mbg.generated
     *//*
    @JsonIgnore
    private Date createTime;*/

    /**
     * 注册IP地址
     *
     * @mbg.generated
     */
    private String createIp;

    /**
     * 是否启用
     *
     * @mbg.generated
     */
    private Byte enable;

    /**
     * 是否領取红包
     *
     * @mbg.generated
     */
    private String ext;

    /**
     * 扩展字段2
     *
     * @mbg.generated
     */
    private String ext2;

    /**
     * 扩展字段3
     *
     * @mbg.generated
     */
    private String ext3;


    public BigDecimal getMasterReward() {
        return masterReward;
    }

    public void setMasterReward(BigDecimal masterReward) {
        this.masterReward = masterReward;
    }

    /**
     * 给师傅返的总赏金
     */
    private BigDecimal masterReward;

    public Integer getUserPid() {
        return userPid;
    }

    public void setUserPid(Integer userPid) {
        this.userPid = userPid;
    }

    /**
     * 师傅的id
     */
    private Integer userPid;


    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardPositive() {
        return cardPositive;
    }

    public void setCardPositive(String cardPositive) {
        this.cardPositive = cardPositive;
    }

    public String getCardOther() {
        return cardOther;
    }

    public void setCardOther(String cardOther) {
        this.cardOther = cardOther;
    }

    public Byte getIsTrue() {
        return isTrue;
    }

    public void setIsTrue(Byte isTrue) {
        this.isTrue = isTrue;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Integer gethSecId() {
        return hSecId;
    }

    public void sethSecId(Integer hSecId) {
        this.hSecId = hSecId;
    }

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public String getDevNo() {
        return devNo;
    }

    public void setDevNo(String devNo) {
        this.devNo = devNo;
    }

  /*  public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }*/

    public String getCreateIp() {
        return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp;
    }

    public Byte getEnable() {
        return enable;
    }

    public void setEnable(Byte enable) {
        this.enable = enable;
    }

    public String getExt() {
        if(StringUtils.isNotBlank(ext)){
            return ext;
        }
        return "0";
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", phone=").append(phone);
        sb.append(", avatar=").append(avatar);
        sb.append(", token=").append(token);
        sb.append(", nickname=").append(nickname);
        sb.append(", sex=").append(sex);
        sb.append(", city=").append(city);
        sb.append(", province=").append(province);
        sb.append(", country=").append(country);
        sb.append(", name=").append(name);
        sb.append(", cardNo=").append(cardNo);
        sb.append(", cardPositive=").append(cardPositive);
        sb.append(", cardOther=").append(cardOther);
        sb.append(", isTrue=").append(isTrue);
        sb.append(", status=").append(status);
        sb.append(", nativePlace=").append(nativePlace);
        sb.append(", hobby=").append(hobby);
        sb.append(", signature=").append(signature);
        sb.append(", hSecId=").append(hSecId);
        sb.append(", hId=").append(hId);
        sb.append(", devNo=").append(devNo);
//        sb.append(", createTime=").append(createTime);
        sb.append(", createIp=").append(createIp);
        sb.append(", enable=").append(enable);
        sb.append(", ext=").append(ext);
        sb.append(", ext2=").append(ext2);
        sb.append(", ext3=").append(ext3);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MissionUser other = (MissionUser) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
                && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
                && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken()))
                && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
                && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
                && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
                && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
                && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getCardNo() == null ? other.getCardNo() == null : this.getCardNo().equals(other.getCardNo()))
                && (this.getCardPositive() == null ? other.getCardPositive() == null : this.getCardPositive().equals(other.getCardPositive()))
                && (this.getCardOther() == null ? other.getCardOther() == null : this.getCardOther().equals(other.getCardOther()))
                && (this.getIsTrue() == null ? other.getIsTrue() == null : this.getIsTrue().equals(other.getIsTrue()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getNativePlace() == null ? other.getNativePlace() == null : this.getNativePlace().equals(other.getNativePlace()))
                && (this.getHobby() == null ? other.getHobby() == null : this.getHobby().equals(other.getHobby()))
                && (this.getSignature() == null ? other.getSignature() == null : this.getSignature().equals(other.getSignature()))
                && (this.gethSecId() == null ? other.gethSecId() == null : this.gethSecId().equals(other.gethSecId()))
                && (this.gethId() == null ? other.gethId() == null : this.gethId().equals(other.gethId()))
                && (this.getDevNo() == null ? other.getDevNo() == null : this.getDevNo().equals(other.getDevNo()))
//                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getCreateIp() == null ? other.getCreateIp() == null : this.getCreateIp().equals(other.getCreateIp()))
                && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
                && (this.getExt() == null ? other.getExt() == null : this.getExt().equals(other.getExt()))
                && (this.getExt2() == null ? other.getExt2() == null : this.getExt2().equals(other.getExt2()))
                && (this.getExt3() == null ? other.getExt3() == null : this.getExt3().equals(other.getExt3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCardNo() == null) ? 0 : getCardNo().hashCode());
        result = prime * result + ((getCardPositive() == null) ? 0 : getCardPositive().hashCode());
        result = prime * result + ((getCardOther() == null) ? 0 : getCardOther().hashCode());
        result = prime * result + ((getIsTrue() == null) ? 0 : getIsTrue().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getNativePlace() == null) ? 0 : getNativePlace().hashCode());
        result = prime * result + ((getHobby() == null) ? 0 : getHobby().hashCode());
        result = prime * result + ((getSignature() == null) ? 0 : getSignature().hashCode());
        result = prime * result + ((gethSecId() == null) ? 0 : gethSecId().hashCode());
        result = prime * result + ((gethId() == null) ? 0 : gethId().hashCode());
        result = prime * result + ((getDevNo() == null) ? 0 : getDevNo().hashCode());
//        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateIp() == null) ? 0 : getCreateIp().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getExt() == null) ? 0 : getExt().hashCode());
        result = prime * result + ((getExt2() == null) ? 0 : getExt2().hashCode());
        result = prime * result + ((getExt3() == null) ? 0 : getExt3().hashCode());
        return result;
    }

}