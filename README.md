
# 🚀 DevSecOps CI/CD Pipeline by RJ

This project demonstrates a complete **end-to-end DevSecOps pipeline** integrating security at every stage of the CI/CD lifecycle.

---

## 🔧 Tech Stack

- **CI/CD**: Jenkins  
- **Code Quality**: SonarQube  
- **Security Scanning**: Trivy  
- **Build Tool**: Maven  
- **Containerization**: Docker  
- **Version Control**: GitHub  

---

## 🔁 Pipeline Workflow


GitHub → Jenkins → Maven Build → SonarQube Scan → Quality Gate → Docker Build → Trivy Scan → DockerHub Push


---

## 🔐 DevSecOps Features

- ✅ Static Code Analysis using SonarQube  
- ✅ Quality Gate enforcement before deployment  
- ✅ Container Image Scanning using Trivy  
- ✅ Fail pipeline on security vulnerabilities  
- ✅ Secure Docker image push to DockerHub  

---

## 📦 Project Structure


.
├── src/
├── pom.xml
├── Dockerfile
├── Jenkinsfile
└── README.md


---

## 🐳 Docker Image

DockerHub Repository:  
👉 https://hub.docker.com/r/rahuljoshi4/devsecops-rj

---

## ▶️ How to Run

### 1. Pull the image

bash
docker pull rahuljoshi4/devsecops-rj:v1
2. Run the container
docker run -d -p 8081:8080 rahuljoshi4/devsecops-rj:v1
3. Open in browser
http://<your-ip>:8081

📊 Output
Interactive DevSecOps Dashboard UI
Real-time pipeline simulation
Security scan status displayed

🎯 Key Highlights
Integrated security into CI/CD pipeline
Automated build, scan, and deployment workflow
Implemented failure handling for vulnerabilities
Built a containerized application with live dashboard

🧠 Learnings
Practical implementation of DevSecOps principles
Handling real-world pipeline failures
Debugging container and dependency issues
Secure artifact creation using Maven Shade Plugin

👨‍💻 Author
Rahul Joshi (RJ)
DevOps | Cloud | 

🔥 Future Enhancements
Kubernetes Deployment (EKS / K8s)
Slack / Email Notifications
Multi-branch Pipeline
Infrastructure as Code (Terraform)

⭐ If you found this useful, consider giving it a star!
