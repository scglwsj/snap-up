package com.snapupproject.dataobject;

public class UserPasswordDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_password.id
     *
     * @mbg.generated Tue Jan 08 23:55:39 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_password.user_id
     *
     * @mbg.generated Tue Jan 08 23:55:39 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_password.encrypted_password
     *
     * @mbg.generated Tue Jan 08 23:55:39 CST 2019
     */
    private String encryptedPassword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_password.id
     *
     * @return the value of user_password.id
     *
     * @mbg.generated Tue Jan 08 23:55:39 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_password.id
     *
     * @param id the value for user_password.id
     *
     * @mbg.generated Tue Jan 08 23:55:39 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_password.user_id
     *
     * @return the value of user_password.user_id
     *
     * @mbg.generated Tue Jan 08 23:55:39 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_password.user_id
     *
     * @param userId the value for user_password.user_id
     *
     * @mbg.generated Tue Jan 08 23:55:39 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_password.encrypted_password
     *
     * @return the value of user_password.encrypted_password
     *
     * @mbg.generated Tue Jan 08 23:55:39 CST 2019
     */
    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_password.encrypted_password
     *
     * @param encryptedPassword the value for user_password.encrypted_password
     *
     * @mbg.generated Tue Jan 08 23:55:39 CST 2019
     */
    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword == null ? null : encryptedPassword.trim();
    }
}