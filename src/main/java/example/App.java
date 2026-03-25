package com.example;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        port(8080);

        // Serve the DevOps Dashboard
        get("/", (req, res) -> {
            return getDashboardHtml();
        });

        System.out.println("🚀 Dashboard running at http://localhost:8080");
    }

    private static String getDashboardHtml() {
        return "<!DOCTYPE html>" +
               "<html lang='en'>" +
               "<head>" +
               "    <meta charset='UTF-8'>" +
               "    <meta name='viewport' content='width=device-width, initial-scale=1.0'>" +
               "    <title>DevSecOps Monitor | RJ</title>" +
               "    <link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>" +
               "    <style>" +
               "        body { background-color: #0d1117; color: #c9d1d9; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; }" +
               "        .card { background-color: #161b22; border: 1px solid #30363d; border-radius: 10px; }" +
               "        .status-pill { padding: 5px 15px; border-radius: 20px; font-size: 0.8rem; font-weight: bold; }" +
               "        .success { background-color: #238636; color: white; }" +
               "        .progress { height: 10px; background-color: #30363d; }" +
               "        .progress-bar { background-color: #238636; }" +
               "        .terminal { background-color: black; color: #39ff14; padding: 15px; font-family: monospace; border-radius: 5px; font-size: 0.9rem; }" +
               "    </style>" +
               "</head>" +
               "<body>" +
               "    <div class='container mt-5'>" +
               "        <div class='d-flex justify-content-between align-items-center mb-4'>" +
               "            <h1>🚀 DevSecOps Pipeline <span class='text-primary'>by RJ</span></h1>" +
               "            <span class='status-pill success'>SYSTEMS ONLINE</span>" +
               "        </div>" +
               "        " +
               "        <div class='row'>" +
               "            <div class='col-md-4 mb-4'>" +
               "                <div class='card p-3'>" +
               "                    <h5>Build Stage</h5>" +
               "                    <p class='text-muted small'>Maven Lifecycle: Package</p>" +
               "                    <div class='progress mb-2'><div class='progress-bar w-100'></div></div>" +
               "                    <span class='text-success small'>● Completed</span>" +
               "                </div>" +
               "            </div>" +
               "            <div class='col-md-4 mb-4'>" +
               "                <div class='card p-3'>" +
               "                    <h5>Security Scan</h5>" +
               "                    <p class='text-muted small'>SonarQube & Trivy</p>" +
               "                    <div class='progress mb-2'><div class='progress-bar w-100'></div></div>" +
               "                    <span class='text-success small'>● 0 Critical Vulnerabilities</span>" +
               "                </div>" +
               "            </div>" +
               "            <div class='col-md-4 mb-4'>" +
               "                <div class='card p-3'>" +
               "                    <h5>Deployment</h5>" +
               "                    <p class='text-muted small'>Docker</p>" +
               "                    <div class='progress mb-2'><div class='progress-bar w-100'></div></div>" +
               "                    <span class='text-success small'>● Active</span>" +
               "                </div>" +
               "            </div>" +
               "        </div>" +
               "        " +
               "        <div class='card p-4 mt-2'>" +
               "            <h5 class='mb-3'>Pipeline Logs</h5>" +
               "            <div class='terminal'>" +
               "                [INFO] Scanning for projects...<br>" +
               "                [INFO] Compiling 1 source file to target/classes<br>" +
               "                [INFO] Running Security Analysis...<br>" +
               "                [INFO] Building Docker Image: devsecops-rj:latest<br>" +
               "                [INFO] Image Pushed to ECR successfully ✅<br>" +
               "                [INFO] ------------------------------------------------------------------------<br>" +
               "                [INFO] BUILD SUCCESS<br>" +
               "                [INFO] ------------------------------------------------------------------------" +
               "            </div>" +
               "        </div>" +
               "    </div>" +
               "</body>" +
               "</html>";
    }
}
