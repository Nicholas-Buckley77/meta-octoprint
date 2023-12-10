## OpenEmbedded / Yocto software layer for Octoprint and additional 3d-printing tools

This layer provides Octoprint front-end and 3d-printing tools
recipes for use with OpenEmbedded and/or Yocto.


## Layer dependencies

| Layer                                                                   | Sublayer           | Required           |
|:------------------------------------------------------------------------|:-------------------|:------------------:|
| [openembedded-core](https://github.com/openembedded/openembedded-core)  | meta               | :heavy_check_mark: |
| [meta-openembedded](https://github.com/openembedded/meta-openembedded)  | meta-oe            | :heavy_check_mark: |
| [meta-openembedded](https://github.com/openembedded/meta-openembedded)  | meta-multimedia    | :heavy_check_mark: |           
| [meta-openembedded](https://github.com/openembedded/meta-openembedded)  | meta-python        | :heavy_check_mark: |          
| [meta-openembedded](https://github.com/openembedded/meta-openembedded)  | meta-networking    | :heavy_check_mark: |
| [meta-openembedded](https://github.com/openembedded/meta-openembedded)  | meta-perl          | :heavy_check_mark: |                    
| [meta-openembedded](https://github.com/openembedded/meta-openembedded)  | meta-webserver     | :heavy_check_mark: |


## Layer origin

Layer is based on old meta-maker layer

Original authors behind meta-maker:
* Denys "denix" Dmytriyenko <denis@denix.org>
* Tim "moto-timo" Orling <TicoTimo@gmail.com>
* Koen Kooi <koen@dominion.thruhere.net>


## Layer updates

This layer has been updated to use be compatible with the nanbield yocto version and provide a version of python known working with octoprint 1.9.3

Author
* Nicholas Buckley <nbuckleyce@gmail.com>