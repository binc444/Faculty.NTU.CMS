package com.ntu.faculty.cms.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "users") // Tên bảng trong cơ sở dữ liệu
@Data // Tự động tạo getter, setter, toString, equals, hashCode (Lombok)
@NoArgsConstructor // Tự động tạo constructor không tham số (Lombok)
@AllArgsConstructor // Tự động tạo constructor với tất cả tham số (Lombok)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Column(nullable = false, length = 255)
    private String password; // Lưu ý: Trong thực tế sẽ là hashed password

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 20)
    private String role; // ADMIN, EDITOR, GUEST

    @Column(nullable = false)
    private boolean enabled; // Trạng thái tài khoản (đã kích hoạt/bị khóa)

}