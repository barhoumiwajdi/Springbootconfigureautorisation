# Springbootconfigureautorisation
Learn how to secure an API with the world's most popular Java framework and Auth0.

So far, you've built an API that allows anyone to read and write data. It's time to tighten the security, so only users with the menu-admin role can create, update, and delete menu items.

Authentication vs. Authorization
To know what a user can do, you first need to know who the user is. This is known as authentication. It is often done by asking for a set of credentials, such as username & password. Once verified, the client gets information about the identity and access of the user.

To implement these Identity and Access Management (IAM) tasks easily, you can use OAuth 2.0, an authorization framework, and OpenID Connect (OIDC), a simple identity layer on top of it.

OAuth encapsulates access information in an access token. In turn, OpenID Connect encapsulates identity information in an ID token. The authentication server can send these two tokens to the client application initiating the process. When the user requests a protected API endpoint, it must send the access token along with the request.

You won't have to worry about implementing OAuth, OpenID Connect, or an authentication server. Instead, you'll use Auth0.

Auth0 is a flexible, drop-in solution to add authentication and authorization services to your applications. Your team and organization can avoid the cost, time, and risk that comes with building your own solution. Also, there are tons of docs and SDKs for you to get started and integrate Auth0 in your stack easily.

Set Up an Authorization Service
Auth0 is a flexible, drop-in solution to add authentication and authorization services to your applications. Your team and organization can avoid the cost, time, and risk that comes with building your own solution to authenticate and authorize users. Auth0 offers tons of guidance and SDKs for you to get started and integrate Auth0 in your stack easily.

To start, you need to create a free Auth0 account if you don't have one yet.
