db.createUser(
    {
        user: "mongodb",
        pwd: "mongodb",
        roles: [
            {
                role: "readWrite",
                db: "mongodb"
            }
        ]
    }
)