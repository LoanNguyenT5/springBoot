# Sử dụng một image chứa JDK để build ứng dụng
FROM openjdk:8-jdk-alpine

# Thiết lập thư mục làm việc
WORKDIR /app

# Sao chép mã nguồn của ứng dụng vào thư mục làm việc của container
COPY . .

# Build ứng dụng
RUN ./mvnw clean install

# Expose cổng 8080 (tùy chỉnh theo cấu hình của bạn)
EXPOSE 8081

# Chạy ứng dụng khi container khởi động
CMD ["./mvnw", "spring-boot:run"]