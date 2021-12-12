variable "region" {
  default     = "eu-west-3"
  description = "AWS region"
}

variable "db_password" {
  description = "RDS root user password"
  default = "KckVhJBf#9&jNR2*"
  sensitive   = true
}


variable "db_user" {
  description = "RDS root username"
  default = "unleash_user"
}

variable "db_name" {
  description = "RDS root username"
  default = "unleashdb"
}